<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Film extends CI_Controller {
	public function index()
	{
        // echo "Hello World";
        $client = new \GuzzleHttp\Client();

        $url = 'http://localhost/webservice/sakila/film_svc.php';

        $response = $client->request('GET', $url);

        $json = $response->getBody()->getContents();

        $films = json_decode($json);

        foreach ($films as $film) {
            echo $film->title . '<br>';
        }
	}
}
