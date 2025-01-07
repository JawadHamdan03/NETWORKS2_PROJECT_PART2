  <?php
    
    if(isset($_POST['EdContact'])) {
        snmp2_set("127.0.0.1", "public", ".1.3.6.1.2.1.1.4.0", "s", $_POST['EdContact']);
    }
    if(isset($_POST['EdLocation'])) {
        snmp2_set("127.0.0.1", "public", ".1.3.6.1.2.1.1.6.0", "s", $_POST['EdLocation']);
    }
    if(isset($_POST['EdName'])) {
        snmp2_set("127.0.0.1", "public", ".1.3.6.1.2.1.1.5.0", "s",$_POST['EdName']);
    }

    $sys_group = snmp2_walk("127.0.0.1", "public", ".1.3.6.1.2.1.1");
    
      echo str_repeat(" ", 125)."SYSTEM GROUP"."\n\n";
    if(isset($_GET['Page'])) {
        foreach ($sys_group as $key => $value) {
            echo $key . ": " . $value . "\n";
        }
    }
  
?>
