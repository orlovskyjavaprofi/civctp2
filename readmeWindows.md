## Copy movies and music to your windows directory
The Windows version supports CD audio music, and the Linux version supports ripped CD music files compressed as ogg (like found in the GoG version). The Audio tracks in the GoG version are named `Track02.ogg` to `Track11.ogg`.

The **ctp2_program/ctp/music** folder, which should be copied to **ctp2_code/ctp/music**, if you want to use them in your working copy.

The music and the videos are not needed for the playing CTP2. However, if you want to use them you can just use the CD on Windows. However, the GoG audio tracks are not supported on Windows, but you can play them in anther player such as VLC, while playing the game.

As the Linux version does not support direct play from the CD-ROM, you need to rip the music-files from the CD and put them on your disk. The music-files can be ripped with `crip` (http://bach.dynet.com/crip/) or `cdparanoia`.

Alternatively, you can download the music-files from YouTube. For that, go in the terminal to the directory `ctp2_program/ctp/music` and run the following code:

```
youtube-dl  -x -t -i --audio-format vorbis --audio-quality 0 'https://www.youtube.com/watch?v=DtQBlVirrkU&list=PL5Z8d0ZfZ8SbHNEFnlR3jckHDmuZjBUaT'
mln -s 'Call to Power 2 - * - *' Track{#1+1}.ogg
i=11; files=(Track*.ogg); for ((f=${#files[@]}-1; f>=0; f--)); do track=$(printf "Track%02d.ogg" $i); mv "${files[$f]}" $track; ((i--)); done
```

You may have to install `youtube-dl` and `mln`.

If you want to play the videos in the game, copy them from the directory `Setup/data/Max/ctp2_data/default/videos/` on the CD to `ctp2_data/default/videos/` of your installation.

You may have to re-encode the videos, however we are not sure about that, because we do not have a CD and a working CD-ROM drive to test it. It might be enough to install the right codec. For re-encoding you can execute the following line from the `ctp2_data/default/videos/` directory:

```
shell> for i in `ls /media/cdrom/Setup/data/Max/ctp2_data/default/videos/`; do mencoder -ovc lavc -lavcopts vcodec=mpeg4  -srate 44100 -af resample=44100 -oac lavc  /media/cdrom/Setup/data/Max/ctp2_data/default/videos/$i -o $i; done 
```

This will also copy the videos to that directory.

**NOTICE FOR DEVELOPERS**
Your start from here **civctp2\ctp2_code\ctp** , there you will find **civctp.sln** , open in your Visual Studio and hopefully everything would work as expected.

CTP2 was originally built on Windows with Visual Studio 6. Today, the code compiles on Visual Studio 2017 and 2019 and probably also later. The code has not been compiled on Windows with any other compiler than the Visual Studio compiler. Beside a version of Visual Studio you need:

    The Windows SDK installed on your computer for DirectX support
    An environment variable named CDKDIR on your computer. In Windows XP/2000, go to Control Panel->System->Environment Variables, and add it, with it's value set to [your source path]/ctp2/bin, the directory with bison, flex, and other tools in it. On Windows 10 it is Control Panel->System->Advanced System Settings->Environment Variables or PC Settings->Info->Advanced System Settings->Environment Variables or press Windows+Pause ->Advanced System Settings->Environment Variables
    A tmp directory in the root directory of the hard drive where the code is. If your source code working copy is on drive C: then create C:\tmp. If you have the code on another drive such as E: than it is E:\tmp.

Once all these are in place, open the Visual Studio project file [your source path]/ctp2_code/ctp/civctp.sln in Visual Studio. The project comes with several configurations. The most important ones are:

    Debug: Unoptimized debug build, with logging, asserts, and a memory leak detector. The leak detector makes it actually slow.
    Final: The build that was shipped with the game.
    Final with Logging: Like Final but with logging, which is very useful for AI debugging.
    Release: Not needed for us, it is close to the Final version but does not include the CD check that the Final version originally included.
    Debug Browse: Like Debug but seems allow also to browse the stack external Microsoft code. So far untested. It requires MSVCRTD.dll, which needs to placed into the folder ctp_code/ctp/ folder. It might be included in your copy of Visual Studio, but it can also be downloded from the internet, if you search for it.

The executables these configurations generate are in [your source path]/ctp2_code/ctp/ and called:

    CivCTP_dbg.exe for Debug
    ctp2.exe for Final
    ctp2log.exe for Final with Logging
    ctp2r.exe for Release
    CivCTP_dbg_browse.exe

CTP2 can directly be run from Visual Studio, to do so press F5 if you want to run it on the debugger, which will be slow and does not make sense for a Final version. To run without debugging, press Ctrl F5. If necessary, CTP2 will be built, first. Some of the map plugins may fail to build the first time in a clean project. Just try compile those again.

## DirectX
I am not sure where you are now in this list. And keep in mind I don't follow these instructions too often, ether.

    Make sure you add the Include and Lib and BaseClasses directories from this SDK to Tools->Options->Directories from Visual Studio, if they are not there already. If you installed them to default locations, that means you need to add e.g. for DirectX 9.0:

    C:\DXSDK\Include
    C:\DXSDK\Samples\C++\DirectShow\BaseClasses

    to your include directories path, and

    C:\DXSDK\Lib
    C:\DXSDK\Samples\C++\DirectShow\BaseClasses\Debug_Unicode

    to your lib directories path.

You only need Include and Lib, the stuff from Samples has been removed from the SDK and wasn't actually used, it was just included.

    If you are using Visual Studio C++ 6.0 you need to add the following line to the list of include directories in front of the Microsoft standart directories, since MSVSC++ 6.0 comes with a defect standart library.

    C:<your CTP2 directory>\ctp2_code\compiler\msvc6\stlfixes

That's obsolete.

    In order to build, you need an environment variable named CDKDIR on your computer. In Windows XP/2000, go to Control
    Panel->System->Environment Variables, and add it, with it's value set to /ctp2/bin, the directory with bison, flex, and other miscellaneous utilities in it.
    In Windows 9X/ME add to your autoexec.bat the following line:

    SET CDKDIR=\CTP2\bin

    Note that you must not add spaces between the environment variable name and the equal sign. The same holds for the path name and the equal sign.

You must do this.

    You have also to create a tmp directory on the harddrive you have the code, e.g.: C:\tmp

And also this.

    Lastly, YOU NEED THE DATA DIRECTORY FROM THE ORIGINAL SHIPPING GAME. All the graphics, sounds, and other data files needed to actually run the game are not included here. Place the ctp2_data directory from the game install directory at the same directory level as ctp2_code in this archive to run an executable built from DevStudio. For instance if your ctp2_data directory has the path:

    C:<your CTP2 directory>\ctp2_data\

    then your ctp2_code directory should have the path:

    C:<your CTP2 directory>\ctp2_code\

I assume you have done this. Bit unrelated, what is DevStudio.

Well, for the rest VS2019 may still refuse to compile something, usually when I upgraded from one version to another there was always some stuff that did not compile, but that can also be fixed. I only used VS2017, even so I have VS2019 installed.

## Very important setup for Visual Studio:
**1. Set civctp2 as startup project**

2. Add  C:\Program Files (x86)\Microsoft DirectX SDK (June 2010)\Include in Additional Include Directories
of the ctp2 project!

This step must be done for all running profiles!

4. Download the package from here https://www.microsoft.com/en-us/download/details.aspx?id=6812
this must be add in include for the ctp2 project: C:\Program Files (x86)\Microsoft DirectX SDK (June 2010)\Include

## Our Version is FORK!! This means we do develop our own branch with goal and target platform Windows!


Continue with installation -> https://github.com/orlovskyjavaprofi/civctp2/blob/master/README.md
