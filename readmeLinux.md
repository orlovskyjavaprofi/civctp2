## Building on Linux

You will probably need GCC 5.x or later to build. The code doesn't seem to build on GCC 4.8.

You will need SDL 2.0, SDL_Mixer 2.0, SDL_Image 2.0. To be able to play movies you also need ffmpeg libraries (some).
You will also need `byacc` and `flex`.
On Debian and friends, use `sudo apt install libsdl2-dev libsdl2-mixer-dev libsdl2-image-dev libtiff-dev libavcodec-dev libavformat-dev libswscale-dev byacc flex` to install them all.

The build itself is pretty classing and straight forward:

```
./autogen.sh
CFLAGS="$CFLAGS -O3 -fuse-ld=gold" CXXFLAGS="$CXXFLAGS -fpermissive -O3 -fuse-ld=gold" ./configure --enable-silent-rules
make
```

If you want to build a debug version it is:

```
./autogen.sh
CFLAGS="$CFLAGS -O0 -fno-omit-frame-pointer -fuse-ld=gold" CXXFLAGS="$CXXFLAGS -fpermissive -O0 -fno-omit-frame-pointer -fuse-ld=gold" ./configure --enable-silent-rules --enable-debug
make
```

Most optimizations are completely disabled at -O0 even if individual optimization flags are specified. In case CTP2 becomes to slow to be useful you can use higher levels of optimization such as -O1, or -O2.

You can look at `./configure` for options, but there aren't many.

Also, note that `make -j4` may fail the first time. Some files are auto-generated and the make dependencies don't catch that.

Finally, you may have to use gold instead of ld for link (add `-fuse-ld=gold` to your CFLAGS & CXXFLAGS if needed).

## Installation on Linux
Since CTP2 was originally a Windows game and CTP2 is not free even if its source code has been released, the installation process is a bit complicated.

### Prepare the data
First, you need the original game files of CTP2.
If you have the CD version, it's better to install it on a Windows machine / using Wine and copy over the files. You need the folders `ctp2_data`, `ctp2_program` and `Scenarios`.

If you have the GoG version, use `innoextract` to extract all the required files (you can `sudo apt install innoextract` if you need) from the `setup_call_to_power2_2.0.0.13.exe` windows installer.
For example `innoextract -m -I app  setup_call_to_power2_2.0.0.13.exe` will extract the `app`folder that contains all the game files, which are in the same subfolders as in the CD version: `ctp2_data`, `ctp2_program` and `Scenarios`.

Put those folder in you `home` path or anywhere else, for example `~/ctp2`

Continue with installation -> https://github.com/orlovskyjavaprofi/civctp2/blob/master/README.md
