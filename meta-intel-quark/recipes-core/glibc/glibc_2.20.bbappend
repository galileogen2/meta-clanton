FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Add security patch CVE-2015-1781 to glibc v2.20 recipe
SRC_URI += "file://CVE-2015-1781-resolv-nss_dns-dns-host.c-buffer-overf.patch "
SRC_URI += "file://CVE-2015-7547.patch "
