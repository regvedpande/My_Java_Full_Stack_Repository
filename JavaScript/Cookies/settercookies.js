function cookieMonster(cookiesToEat) {
  /**
   * Simulates a cookie monster eating cookies.
   *
   * @param {number} cookiesToEat - The number of cookies the monster wants to eat.
   * @returns {string} - A string describing the cookie monster's actions.
   */

  if (cookiesToEat <= 0) {
    return "Cookie Monster says: 'Me want cookies!'";
  } else if (cookiesToEat === 1) {
    return "Cookie Monster says: 'Me eat one cookie! Om nom nom!'";
  } else if (cookiesToEat <= 5) {
    return `Cookie Monster says: 'Me eat ${cookiesToEat} cookies! Om nom nom nom nom!'`;
  } else {
    return `Cookie Monster says: 'Me eat ${cookiesToEat} cookies! ...Me so full! Burp!'`;
  }
}

// Example usage:
console.log(cookieMonster(3));
console.log(cookieMonster(1));
console.log(cookieMonster(0));
console.log(cookieMonster(10));
