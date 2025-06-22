//const axios = require('axios');
import axios from "axios";


const makeRequest = async (path) => {
  const url = `http://localhost:8082/${path}`;
  console.log(`>> Request ${url}`)
  const start = Date.now();

  try {    
    const response = await axios.get(url);
    const end = Date.now();
    const durationMs = end - start;

    console.log(`Process runing for : ${durationMs} ms`);
    console.log(`Count of records: ${response.data.length}`);
  } catch (err) {
    console.error("Error:", err.message);
  }
}

export const makeRequestAccountingEntries = async () => {
  await makeRequest('api/v2/report/accounting-entries');
}

export const makeRequestAccountingPerCustomer = async (customerName) => {
  await makeRequest(`api/v2/report/accounting-entries/${customerName}`);  
}
