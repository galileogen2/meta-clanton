DESCRIPTION = "An image capable of fast boot on X1000 targets"

IMAGE_INSTALL = "packagegroup-core-boot ${ROOTFS_PKGMANAGE_BOOTSTRAP} ${CORE_IMAGE_EXTRA_INSTALL}"

IMAGE_LINGUAS = " "

LICENSE = "GPLv2"

IMAGE_FSTYPES = "ext3 hddimg"

inherit core-image

NOISO = "1"

EXTRA_IMAGECMD_append_ext2 = " -N 2000"

IMAGE_FEATURES += "package-management"

IMAGE_INSTALL += "kernel-modules"
IMAGE_INSTALL += "ethtool"
IMAGE_INSTALL += "strace"
IMAGE_INSTALL += "ppp"
IMAGE_INSTALL += "linuxptp"
IMAGE_INSTALL += "libstdc++"
IMAGE_INSTALL += "dmidecode"
IMAGE_INSTALL += "grub-efi"

GRUB_TIMEOUT = "0"
GRUB_SERIAL = "console=ttyS1,115200n8 earlycon=uart8250,mmio32,$EARLY_CON_ADDR_REPLACE,115200n8"

IMAGE_INSTALL_remove += " galileo-target galileo-init"
IMAGE_INSTALL_remove += " modutils-initscripts"

