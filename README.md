# meta-helios-splashscreen

This README file provides information about the `meta-helios-splashscreen` layer.

The `meta-helios-splashscreen` layer allows customization of splash screen colors and images for our custom Operating System.

Please refer to the sections below for more details.

## Dependencies

- **URI**: `git://git.yoctoproject.org/poky`
- **Compatible branches**: `scarthgap`, `nanbield`, `langdale`, `kirkstone`, `dunfell`, `mickledore`

## Patches

Please submit any patches against this layer to the maintainers for review!

**Maintainers**:
- Yassine DEHHANI <yassine.dehhani@ynov.com>
- Emile BAILEY <emile.bailey@ynov.com>

## How It's Done

### I. Adding the meta-helios-splashscreen Layer to Your Build

1. Clone the `meta-helios-splashscreen` repository:

```bash
git clone https://github.com/yaxsomo/meta-helios-splashscreen.git
```

2. Add the path to `meta-helios-splashscreen` to the `poky/build/conf/bblayers.conf` file.

### II. Customization

#### Logo Customization
Rename your logo image to logo.png.
Place the `logo.png` file in `meta-helios-splashscreen/recipes-core/psplash/files`.

#### Color Customization
Customize the splash screen colors in `meta-helios-splashscreen/recipes-core/psplash/customize.bb` file. 
The following psplash variables can be modified:

- BACKGROUND_COLOR
- TEXT_COLOR
- BAR_COLOR
- BAR_BACKGROUND_COLOR

### III. Bake the Recipe

- Run the following command to bitbake your image :
    
```bash
bitbake your-image
```
