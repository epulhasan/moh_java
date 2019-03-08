<form method="post">
Film ID : <input type="text" name="id">
<button type="submit">Submit</button>
</form>

<?php
if(isset($_POST['id'])) {
	require "vendor/autoload.php";

	$client = new \GuzzleHttp\Client();

	$id = $_POST['id'];
	$url = 'http://localhost/webservice/sakila/film_detail.php';
	$param = [ 
		'query' => [
			'id' => $id, 
			'token' => '7239fhv83hd82hgf74gfd72hjs9dfh28sd128djsj'
		]
	];

	$result = $client->request('GET', $url, $param);

	$json = $result->getBody()->getContents();

	$film = json_decode($json);

	// print_r($json); exit;

	if(isset($film->err)){
		echo $film->err;
	} else {
		echo "ID : $film->film_id <br>";
		echo "Title : $film->title <br>";
		echo "Description : $film->description <br>";
	}
}