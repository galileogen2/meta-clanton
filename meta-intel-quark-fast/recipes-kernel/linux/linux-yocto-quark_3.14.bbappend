# find defconfig path
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

#uncomment to disable all auto-load modules during boot-time
#KERNEL_MODULE_AUTOLOAD_quark_quark-fast = " "

SRC_URI_append_quark_quark-fast = " file://kernel-lzo.cfg"

