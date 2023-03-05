This is a fork of opensource project https://github.com/civctp2/civctp2 , this special fork  maintained by Alexander Orlovsky CEO of Orlovsky Consulting GbR www.javaprofide.de

[![Build Status](https://travis-ci.com/civctp2/civctp2.svg?branch=master)](https://travis-ci.com/civctp2/civctp2)

#### CivCTP2
- Git SVN import of http://ctp2.darkdust.net/anonsvn/
- Originally hosted at: https://ctp2.darkdust.net/
- Forums: https://apolyton.net/forum/other-games/call-to-power-2/ctp2-source-code-project

### Original readme files
- [Activision CTP2 Source Code_Readme.txt](https://github.com/civctp2/civctp2/blob/master/Activision%20CTP2%20Source%20Code_Readme.txt)
- [Apolyton CTP2 Source Code_Readme.txt](https://github.com/civctp2/civctp2/blob/master/Apolyton%20CTP2%20Source%20Code_Readme.txt)

## About

This is the Apolyton version of the *Call to Power II* source code based on the released source code from Activision, that did not include the patch. The code has been stripped of comments, but is otherwise complete as far as Activision's code goes. It was originally built with Microsoft Visual Studio 6.0. In the mean time the Apolyton code was modified so that it works with later versions.
This version builds on Linux (i386 and x86_64), Ubuntu, Pandora, and Pyra.

Note that the game files are not included in this repository, you can get them from the original CD or from the [GoG version](https://www.gog.com/game/call_to_power_2).

![screenshot](screenshot.png "screenshot of CTP2 running on Linux")
![Advance-Graph](Advance-Graph/Advance_english.png "generated Advance-Graph as PNG, SVG and PDF")


### Install the Apolyton edition
Once you have the original game files, copy the updated files from this git over them. Simply `cp -r ctp2_data/* ~/ctp2/ctp2_data` should do that.
Note, that this is a Windows game, where file names are case-insensitive. This version of CTP2 handles this, and file names can have any case, but the `cp` command may not overwrite the files that differ in case. If you find a strange behavior or think the files are not up-to-date, check that you don't have 2 copies of a file in different cases (lowercase everything if needed). With the GoG version, no renaming is needed.

### Copy the Linux executable
When the build is over, you need to copy the main CTP2 executable, plus the mapgen libraries to the program folder (wich is `ctp2_program/ctp`).
for the executable, and the command is something like: `cp -v ctp2_code/ctp2 ~/ctp2/ctp2_program/ctp/`
The mapgen libraries will go to `ctp2_program/ctp/dll/map/` .
So do something like `cp -v ctp2_code/mapgen/.libs/*.so ~/ctp2/ctp2_program/ctp/dll/map/`

If you get the message on the terminal: `Failed to load module "atk-bridge"`. Install at-spi with `sudo apt install at-spi`.

## Running
When everything is setup, simply go to the program folder, for example with `cd ~/ctp2/ctp2_program/ctp` and launch the game with `./ctp2`. There are a few command line option like `-fullscreen` that can be useful.

### Converting old Linux save-games to new unified format
The old format of Linux save-games was not compatible with that of windows save-games. The format is now unified such that each OS can open save-games from the other. However, due to this, old Linux save-games need to be converted to the new format if you want to continue with those under the new ctp2 version (after [22dd1804804](https://github.com/civctp2/civctp2/commit/22dd180480445561bbbcd3efc60f08d2fe5c53e5)). A [game-converter-version](https://github.com/civctp2/civctp2/releases/tag/GameConverter) was created for this purpose (see, [#77](https://github.com/civctp2/civctp2/pull/77)), which can load the old format but saves games to the new format.

