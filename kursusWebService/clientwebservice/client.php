<?php
// client web service. to call film web service
require "vendor/autoload.php";

$client = new \GuzzleHttp\Client();

$response = $client->request('GET', 'http://localhost/webservice/sakila/film_svc.php');

$json = $response->getBody()->getContents();

$films = json_decode($json);

foreach ($films as $film) {
    echo $film->title . '<br>';
}