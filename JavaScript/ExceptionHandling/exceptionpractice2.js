function validateInput(input) {
    if (!input) {
      throw new Error('Input is required');
    }
  }
  
  try {
    let userInput = null;
    validateInput(userInput);
    console.log('Input is valid:', userInput);
  } catch (error) {
    console.error('Validation error:', error.message);
  }
  