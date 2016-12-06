<?PHP 
    include_once("koneksi.php"); 
    if( isset($_POST['txtUsername'])) { 
        $username = $_POST['txtUsername'];
        $password = $_POST['txtPassword'];

        //$pass_user = md5($password);
        $query = "INSERT INTO login(username,password) VALUES('".$username."','".$password."')"; 
        if (mysqli_query($conn, $query)) {
            echo "terdaftar";
            exit;
        }else{
            echo "gagal";
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
            <input type="submit" name="btnSubmit" value="Register"/>
        </form>
    </body>
</html>