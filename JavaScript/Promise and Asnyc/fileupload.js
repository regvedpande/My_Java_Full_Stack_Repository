async function uploadFile(fileName) {
    return new Promise((resolve, reject) => {
      setTimeout(() => {
        console.log(`Uploading file: ${fileName}`);
        resolve(`File ${fileName} uploaded successfully!`);
      }, 2000);
    });
  }
  
  async function main() {
    try {
      const result = await uploadFile('image.jpg');
      console.log(result);
    } catch (error) {
      console.error(error);
    }
  }
  main();