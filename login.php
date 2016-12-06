<?PHP 
    include_once("koneksi.php"); 
    if( isset($_POST['txtUsername'])) { 
        $username = $_POST['txtUsername'];
        $password = $_POST['txtPassword'];

        //$pass_user = md5($password);
        $query = "SELECT * FROM login where username = '$username' and password = '$password'"; 
        
        $result = mysqli_query($conn, $query);
        $row = array();
        
        if($result->num_rows > 0){
            //if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){ 
            //    echo "success"; 
             //   exit; 
            //} 
            //header("location: main.php"); //replace index.php with your url
            // while($row = mysqli_fetch_assoc($result)){
            //     $data[] = $row;
            // }
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
            Username <input type="text" name="txtUsername" value="" /><br/>
            Password <input type="password" name="txtPassword" value="" /><br/>
            <input type="submit" name="btnSubmit" value="Login"/>
        </form>
    </body>
</html>