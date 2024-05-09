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

Continue with installation -> https://github.com/orlovskyjavaprofi/civctp2/blob/master/README.md
