##This is a fork of opensource project CIVCCTP2
https://github.com/civctp2/civctp2 
**This special fork maintained by Alexander Orlovsky CEO of Orlovsky Consulting GbR www.javaprofide.de

[![Build Status](https://travis-ci.com/civctp2/civctp2.svg?branch=master)](https://travis-ci.com/civctp2/civctp2)

#### CivCTP2
- Git SVN import of http://ctp2.darkdust.net/anonsvn/
- Originally hosted at: https://ctp2.darkdust.net/
- Forums: https://apolyton.net/forum/other-games/call-to-power-2/ctp2-source-code-project

### Legal
- [Activision CTP2 Source Code_Readme.htm](https://orlovskyjavaprofi.github.io/civctp2/Legal/Activision%20CTP2%20Source%20Code_Readme.htm)
- [Activision CTP2 Source Code_Readme.txt](https://github.com/orlovskyjavaprofi/civctp2/blob/master/Legal/Activision%20CTP2%20Source%20Code_Readme.txt)
- [Apolyton CTP2 Source Code_Readme.txt](https://github.com/orlovskyjavaprofi/civctp2/blob/master/Legal/Apolyton%20CTP2%20Source%20Code_Readme.txt)
- [EULA Activision source code conditions and terms](https://github.com/orlovskyjavaprofi/civctp2/blob/master/Legal/EULA%20-%20Source%20Code%20for%20CTP2.rtf)

## About
This is the Apolyton version of the **Call to Power II** source code based on the released source code from Activision, that did not include the patch. The code has been stripped of comments, but is otherwise complete as far as Activision's code goes. 

It was originally built with Microsoft Visual Studio 6.0. In the mean time the Apolyton code was modified so that it works with later versions.
This version builds on Linux (i386 and x86_64), Ubuntu, Pandora, and Pyra.

**Note: currently this fork is maintained by Orlovsky Consulting GbR www.orlovskyconsulting.de**

**Note that the game files are not included in this repository, you can get them from the original CD or from the [GoG version](https://www.gog.com/game/call_to_power_2).**

![screenshot](screenshot.png "screenshot of CTP2 running on Linux")

## Windows build
https://github.com/orlovskyjavaprofi/civctp2/blob/master/readmeWindows.md

## Linux build 
https://github.com/orlovskyjavaprofi/civctp2/blob/master/readmeLinux.md

## Installation steps 
https://github.com/orlovskyjavaprofi/civctp2/blob/master/install.md

## Running
When everything is setup, simply go to the program folder, for example with `cd ~/ctp2/ctp2_program/ctp` and launch the game with `./ctp2`. There are a few command line option like `-fullscreen` that can be useful.

### Converting old Linux save-games to new unified format
The old format of Linux save-games was not compatible with that of windows save-games. The format is now unified such that each OS can open save-games from the other. However, due to this, old Linux save-games need to be converted to the new format if you want to continue with those under the new ctp2 version (after [22dd1804804](https://github.com/civctp2/civctp2/commit/22dd180480445561bbbcd3efc60f08d2fe5c53e5)). A [game-converter-version](https://github.com/civctp2/civctp2/releases/tag/GameConverter) was created for this purpose (see, [#77](https://github.com/civctp2/civctp2/pull/77)), which can load the old format but saves games to the new format.

## Contributing to this projects
Read more about -> https://github.com/orlovskyjavaprofi/civctp2/blob/master/CONTRIBUTING.md
