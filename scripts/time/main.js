const axios = require('axios');

async function main() {
  const start = Date.now();

  try {
    const response = await axios.get("http://localhost:8082/api/v1/report/accounting-entries");
    const end = Date.now();
    const durationMs = end - start;

    console.log(`Duración: ${durationMs} ms`);
    console.log(`Total registros: ${response.data.length}`);
  } catch (err) {
    console.error("Error:", err.message);
  }
}

main();
