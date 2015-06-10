if (i % 2 == 0) {
      if (i < n) request $R_i$
      if (i+2 < n) request $R_{i+2}$
}
else {
      if (i < n) request $R_{n-i}$
      if (i+2 < n) request $R_{n-i-2}$
}

