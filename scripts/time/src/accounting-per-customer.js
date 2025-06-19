import { makeRequestAccountingPerCustomer } from "./request-report.js"

function delay(ms) {
  return new Promise(resolve => setTimeout(resolve, ms));
}

async function main() {
  for (let i = 0; i < 3; i++) {
    await makeRequestAccountingPerCustomer('Disney')
    await delay(2000); // 2 seconds of delay
  }
}

main();
