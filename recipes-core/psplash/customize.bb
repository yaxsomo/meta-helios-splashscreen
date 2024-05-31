SUMMARY = "A psplash customization recipe"
DESCRIPTION ="This recipe allows personalization of pshlash colors and image"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=53004bb60abf56199b0ba0b1267907e9"

# Logo image file name as in /files folder
SPLASH_IMAGE_NAME = "logo.png"

# Color values in R,G,B format "0x00,0x00, 0x00"
BACKGROUND_COLOR = "0xff,0xff,0xff"
TEXT_COLOR  = "0xff,0x00,0x00"
BAR_COLOR = "0x6d,0x6d,0x70"
BAR_BACKGROUND_COLOR = "0xff,0xff,0xff"

# Overide MACHINE_PSPLASH_PKG name
# add you own override if misssing
MACHINE_PSPLASH_PKG:qemuall = "default"
MACHINE_PSPLASH_PKG:qemux86-64 = "default"
MACHINE_PSPLASH_PKG:rpi = "raspberrypi"
