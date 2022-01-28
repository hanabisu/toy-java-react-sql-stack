import axiosConfig from '../axiosConfig'

export async function login(data) {
    console.log(data);
    const response = await axiosConfig.post('auth/signin', data);
    console.log(response);
    return response.data;
}