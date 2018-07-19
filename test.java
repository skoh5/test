void sha256(String input) {
  MessageDigest digest = MessageDigest.getInstance("SHA-256")
  byte[] result = digest.digest(input.getBytes());
  StringBuffer strBuf = new StringBuffer();
  for(int i=0;i<result.lengh;i++) {
    strBuf.append(Integer.toString((result[i] & 0xFF) + 0x100, 16).substring(1));
  }
}

// net - https://gist.github.com/junsuk5/f0ff2298e17853dc48e89f2dfc7bd985
// rock - https://winterbe.com/posts/2015/04/30/java8-concurrency-tutorial-synchronized-locks-examples/
