const getData = () => {
    return new Promise((resolve, reject) => {
    setTimeout(() => {
        const data = "Some data fetched from an API";
        if (data) {
        resolve(data);
        } else {
        reject("Failed to fetch data");
        }
      }, 2000); // Simulating an asynchronous operation
    });
};

const fetchData = async () => {
    try {
    const result = await getData();
    console.log(result);
    } catch (error) {
    console.error(error);
    }
};

fetchData();