<?PHP 
    include_once("koneksi.php"); 
    if( isset($_POST['txtNamabarang'])) { 
        $namabarang = $_POST['txtNamabarang'];
        //$pass_user = md5($password);
        $query = "SELECT * FROM olshol where nama like '%".$namabarang."%'"; 
        
        $result = mysqli_query($conn, $query);
  
        
        if($result->num_rows > 0){
            while ($data = mysqli_fetch_assoc($result)) {
            $data_array[] = $data;
        	}
        	echo json_encode($data_array);
            exit;
        } 
        else{ 
            echo "login failed"; 
            exit;
        } 
    } 
?>
<html>
<head><title>LoginSample</title></head>
    <body>
        <h1>Login Example</h1>
        <form action="<?PHP $_PHP_SELF ?>" method="post">
            Username <input type="text" name="txtNamabarang" value="" /><br/>
            <input type="submit" name="btnSubmit" value="Login"/>
        </form>
    </body>
</html>