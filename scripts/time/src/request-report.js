//const axios = require('axios');
import axios from "axios";

export const makeRequestAccountingEntries = async () => {
  console.log('>> Request accouting entries')
  const start = Date.now();

  try {
    const response = await axios.get("http://localhost:8082/api/v1/report/accounting-entries");
    const end = Date.now();
    const durationMs = end - start;

    console.log(`Process runing for : ${durationMs} ms`);
    console.log(`Count of records: ${response.data.length}`);
  } catch (err) {
    console.error("Error:", err.message);
  }
}

export const makeRequestAccountingPerCustomer = async (customerName) => {
  console.log('>> Request accounting per customer')
  const start = Date.now();

  try {
    const response = await axios.get(`http://localhost:8082/api/v1/report/accounting-entries/${customerName}`);
    const end = Date.now();
    const durationMs = end - start;

    console.log(`Process runing for : ${durationMs} ms`);
    console.log(`Count of records: ${response.data.length}`);
  } catch (err) {
    console.error("Error:", err.message);
  }
}
