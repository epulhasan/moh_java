<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class Welcome extends CI_Controller {
	// client web service, to insert actor data
	public function newactor()
	{
		$client = new \GuzzleHttp\Client();

		$url = 'http://localhost/codeigniter3/index.php/actor/add';
		$data = [
			'form_params' => [
					'first_name' => 'John',
					'last_name' => 'Doe'
			]
		];

		$response = $client->request('POST', $url, $data);
	}

	public function index()
	{
		$this->load->view('welcome_message');
	}
}
