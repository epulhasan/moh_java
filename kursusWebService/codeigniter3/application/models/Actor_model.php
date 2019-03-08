<?php 
class Actor_model extends CI_Model {
	function listing() {
        $query = $this->db->get('actor');
        // return sebagai object
        // return $query->result(); 
        // return sebagai array
        return $query->result_array();
    }

    function insert($data) {
        $this->db->insert('actor', $data);
    }
}