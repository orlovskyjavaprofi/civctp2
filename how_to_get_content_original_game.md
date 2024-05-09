Clone and complete your working copy

First, clone this repository into a directory of your choice. It will contain, beside some others, the following subdirectories:

    ctp2_code
    ctp2_data
    Scenarios

The directory ctp2_code contains the source code and will contain the generated executable. The directory ctp2_data contains the data files, such as sounds, images, and the database text files that contain all data for the game objects such as move points for units.

Even so the source code of CTP2 has been published, CTP2 is not free software. That means, we cannot distribute CTP2 and its code as a standalone product. Therefore, you have to add in the missing components from your copy of CTP2.

If you already have a copy of CTP2 installed, you can just copy everything from this repository into your installation, which is typically found in C:\Program Files\Activision\Call to Power II\.

If you do not have a copy already installed, you can get the files from the CD. The CD contains two files civlang.ctp and civmain.ctp (the extensions might differ). These files are zip files. The file civmain.ctp contains all files that are common to all language versions, civlang.ctp contains all files specific to your language version. Unzip these files and copy their content over your working copy without replacing files that already exist.

If you have the GoG version, use innoextract to extract all the required files (you can sudo apt install innoextract if you need) from the setup_call_to_power2_2.0.0.13.exe windows installer. For example innoextract -m -I app  setup_call_to_power2_2.0.0.13.exe will extract the appfolder that contains all the game files, which are in the same subfolders as in the CD version: ctp2_data, ctp2_program and Scenarios. Copy these folders over your working copy without replacing files that already exist. Now you should have those directories in your working copy.

    ctp2_code
    ctp2_data
    Scenarios
    ctp2_program

The folder ctp2_program is a stripped down version of ctp2_code without the source code and is the version that was shipped with the game. It is not needed for compiling and running the game. If it is an from a previous installation and you have some save games you want to use in your working copy then copy the folder /ctp2_program/ctp/save/ and all its content to /ctp2_code/ctp/save/.
