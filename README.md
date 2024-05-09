## This is a fork of opensource project CivCTP2 our codebase basicly "Remaded" for Windows
**Origin:** https://github.com/civctp2/civctp2 

## We take donations!
**If you like this project , consider to donate https://github.com/orlovskyjavaprofi/civctp2/blob/master/funding.md**

#### This special fork of CivCTP2 maintained by Alexander Orlovsky CEO of Orlovsky Consulting GbR www.orlovskyconsulting.de

## Orlovsky Consulting GbR goals for this project
**Read more about our goals for the maintenance of this codebase** -> https://orlovskyjavaprofi.github.io/civctp2/

### Legal
- [Activision CTP2 Source Code_Readme.htm](https://orlovskyjavaprofi.github.io/civctp2/Legal/Activision%20CTP2%20Source%20Code_Readme.htm)
- [Activision CTP2 Source Code_Readme.txt](https://github.com/orlovskyjavaprofi/civctp2/blob/master/Legal/Activision%20CTP2%20Source%20Code_Readme.txt)
- [Apolyton CTP2 Source Code_Readme.txt](https://github.com/orlovskyjavaprofi/civctp2/blob/master/Legal/Apolyton%20CTP2%20Source%20Code_Readme.txt)
- [EULA Activision source code conditions and terms](https://github.com/orlovskyjavaprofi/civctp2/blob/master/Legal/EULA%20-%20Source%20Code%20for%20CTP2.rtf)

## About
This is the Apolyton version of the **Call to Power II** source code based on the released source code from Activision, that did not include the patch. 

**The code has been stripped of comments, but is otherwise complete as far as Activision's code goes.**
In the mean time the Apolyton code was modified so that it works with later versions.

## It was originally built with Microsoft Visual Studio 6.0.

## Please notice 
This is **a fork** , which maintained by **Orlovsky Consulting GbR www.orlovskyconsulting.de**

**The game asset files are not included in this repository**, you can get them from 
**the original CD** or **from the [GoG version](https://www.gog.com/game/call_to_power_2).**

![Call to Power 2 Apolyton version](https://github.com/orlovskyjavaprofi/civctp2/blob/master/ctp2start-scr.png)

## Building the game from sourcecode
**This version of Call to Power 2 Apolyton, works only on Windows!**
**You need for this version of Call to Power 2 a **Visual Studio Community edition** up from 2022 and **Microsoft DirectX SDK (June 2010)**  lib **(See section Windows build)**

## How to get videos and music from original game and copy it to the apolyton version
https://github.com/orlovskyjavaprofi/civctp2/blob/master/how_to_get_content_original_game.md

## Windows build
https://github.com/orlovskyjavaprofi/civctp2/blob/master/readmeWindows.md

## Installation steps 
https://github.com/orlovskyjavaprofi/civctp2/blob/master/install.md

## Running
Simple use the installer, or if its all prepackaged you run you game where give executable, **stay tuned for more info!**

## Bugs reporting
As it has been said here, my company Orlovsky Consulting GbR does the maintaince of this project fork, but if you at some point **try original apolyton version** and find bugs , **well you should consider to contact them first : https://github.com/civctp2/civctp2/issues**

## Feature request
First we need to make sure, that game runs stable, if you really think about feature, well you can file a github issue , **but dont expect that we implement it** , the game is old and we only interested in maintaining of it.

**We try to stay in sync with the upstream**, but if we decide to do something differently and on our side the quality improve and well if you find bugs in our version of the game then you can report it via our **issues:** **https://github.com/orlovskyjavaprofi/civctp2/issues**

## Game manual
Read about structure of docu https://github.com/orlovskyjavaprofi/civctp2/blob/master/doc/README.txt , **you need skils in tex in order to compile it into pdf.** 

### Upstream news: converting old Linux save-games to new unified format
The old format of Linux save-games was not compatible with that of windows save-games. 

The format is now unified such that each OS can open save-games from the other. 
However, due to this, old Linux save-games need to be converted to the new format if you want to continue with those under the new ctp2 version (after [22dd1804804](https://github.com/civctp2/civctp2/commit/22dd180480445561bbbcd3efc60f08d2fe5c53e5)). 

A [game-converter-version](https://github.com/civctp2/civctp2/releases/tag/GameConverter) was created for this purpose (see, [#77](https://github.com/civctp2/civctp2/pull/77)), which can load the old format but saves games to the new format.

#### CivCTP2 historical references
- Git SVN import of http://ctp2.darkdust.net/anonsvn/
- Originally hosted at: https://ctp2.darkdust.net/
- Forums: https://apolyton.net/forum/other-games/call-to-power-2/ctp2-source-code-project

