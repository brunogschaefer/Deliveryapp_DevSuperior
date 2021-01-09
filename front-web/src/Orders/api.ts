import axios from "axios";

const API_URL = 'https://schefa-delivery.herokuapp.com';

export function fetchProducts(){
    return axios(`${API_URL}/products`)
}