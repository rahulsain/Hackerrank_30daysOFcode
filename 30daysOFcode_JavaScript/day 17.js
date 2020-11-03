function Calculator() {
  this.power = function(n, p) {
    try {
      if (n >= 0 && p >= 0) {
        return Math.pow(n, p)
      } else {
        throw 'n and p should be non-negative'
      }
    } catch (err) {
      return err
    }
  }

}
