This README file contains information on the contents of the meta-helios-splashscreen layer.

meta-helios-splashscreen layes allows customization of pshlash colors and image of our custom Operating System.

Please see the corresponding sections below for details.

Dependencies
============

  URI: git://git.yoctoproject.org/poky
  compatible branches: scarthgap | nanbield | langdale | kirkstone | dunfell | mickledore


Patches
=======

Please submit any patches against this layer to me for review!

Maintainers: Yassine DEHHANI <yassine.dehhani@ynov.com> | Emile BAILEY <emile.bailey@ynov.com>



How it's done
=================

  I. Adding the meta-helios-splashscreen layer to your build
    1. Clone meta-helios-splashscreen by running `git clone https://github.com/yaxsomo/meta-helios-splashscreen.git`
    2. Run 'path/to/meta-helios-splashscreen' to the to poky/build/conf/bblayers.conf file.

  II. Customization
    - Logo image customization
      1. Rename your logo image to logo.png
      2. Place the logo.png file in `meta-helios-splashscreen/recipes-core/psplash/files`

    - Color customization
      1. Customize the splash scereen colors in `meta-helios-splashscreen/recipes-core/psplash/customize.bb`
      The following pspash variables can be modified
        - BACKGROUND_COLOR
        - TEXT_COLOR
        - BAR_COLOR
        - BAR_BACKGROUND_COLOR

  III. Bake the recipe
      - Run `bitbake your-image`
