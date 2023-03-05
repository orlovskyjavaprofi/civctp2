### Install the Apolyton edition
Once you have the original game files, copy the updated files from this git over them. Simply `cp -r ctp2_data/* ~/ctp2/ctp2_data` should do that.
Note, that this is a Windows game, where file names are case-insensitive. This version of CTP2 handles this, and file names can have any case, but the `cp` command may not overwrite the files that differ in case. If you find a strange behavior or think the files are not up-to-date, check that you don't have 2 copies of a file in different cases (lowercase everything if needed). With the GoG version, no renaming is needed.

### Copy the Linux executable
When the build is over, you need to copy the main CTP2 executable, plus the mapgen libraries to the program folder (wich is `ctp2_program/ctp`).
for the executable, and the command is something like: `cp -v ctp2_code/ctp2 ~/ctp2/ctp2_program/ctp/`
The mapgen libraries will go to `ctp2_program/ctp/dll/map/` .
So do something like `cp -v ctp2_code/mapgen/.libs/*.so ~/ctp2/ctp2_program/ctp/dll/map/`

If you get the message on the terminal: `Failed to load module "atk-bridge"`. Install at-spi with `sudo apt install at-spi`.

Continue -> https://github.com/orlovskyjavaprofi/civctp2/blob/master/README.md
