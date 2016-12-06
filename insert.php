<?PHP 
    include_once("koneksi.php"); 
    if( isset($_POST['txtNamabarang'])) { 
        $namaBarang = $_POST['txtNamabarang'];
        $ketBarang = $_POST['txtKetbarang'];
        $harga = $_POST['txtHargabarang'];
        $stok = $_POST['txtStok'];

        //$pass_user = md5($password);
        $query = "INSERT INTO olshol(nama,keterangan,harga,stok) VALUES('".$namaBarang."','".$ketBarang."',".$harga.",".$stok.");";

        
        if(mysqli_query($conn,$query)){
            //if(isset($_POST['mobile']) && $_POST['mobile'] == "android"){ 
            //    echo "success"; 
             //   exit; 
            //} 
            //header("location: main.php"); //replace index.php with your url
            // while($row = mysqli_fetch_assoc($result)){
            //     $data[] = $row;
            // }
            
        	echo "sukses";
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
            NamaBarang <input type="text" name="txtNamabarang" value="" placeholder="nama barang" required /><br/>
            Keterangan <textarea rows="4" cols="50" name="txtKetbarang" placeholder="keterangan barang" required></textarea><br/>
            Harga Satuan<input type="number" name="txtHargabarang" value="" placeholder="harga satuan barang" required /><br/>
            Stok <input type="number" name="txtStok" value="" placeholder="stok barang" required /> <br />
            <input type="submit" name="btnSubmit" value="Login"/>
        </form>
    </body>
</html>