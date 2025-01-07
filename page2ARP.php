<?php
$ip = "127.0.0.1:161";

// SNMP queries for ARP table
$arpIndex = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.1");
$arpMac = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.2");
$arpIp = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.3");
$arpType = snmp2_walk($ip, "public", ".1.3.6.1.2.1.4.22.1.4");

echo str_pad("Index", 20) . str_pad("MAC", 70) . str_pad("IP", 30) . str_pad("Type", 30) . "\n";

for ($i = 0; $i < count($arpIndex); $i++) {
    echo str_pad($arpIndex[$i],20) . str_pad($arpMac[$i], 70) . str_pad($arpIp[$i], 30) . str_pad($arpType[$i], 30) . "\n";
}
?>
