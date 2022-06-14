//reflection
https://codechacha.com/ko/reflection/
http://tutorials.jenkov.com/java-reflection/index.html

//thread pool
http://hochulshin.com/java-multithreading-executor-basic/
https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/

// make hash string
void sha256(String input) {
  MessageDigest digest = MessageDigest.getInstance("SHA-256")
  byte[] result = digest.digest(input.getBytes());
  StringBuffer strBuf = new StringBuffer();
  for(int i=0;i<result.lengh;i++) {
    strBuf.append(Integer.toString((result[i] & 0xFF) + 0x100, 16).substring(1));
  }
}

// net - https://gist.github.com/junsuk5/f0ff2298e17853dc48e89f2dfc7bd985

// lock - https://winterbe.com/posts/2015/04/30/java8-concurrency-tutorial-synchronized-locks-examples/

// keyin
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
while (true) {
  String strInput = br.readLine();
}

//list sort - 
Collections.sort(al, (g1, g2) -> g1.getName().compareTo(g2.getName()));

// Integer List to int[]
list.stream().mapToInt(i->i.intValue()).toArray();

//숫자 각 자리 처리 
while(true) {
  mod = n % 10;
  answer += mod;
  n = n/10;
  if(n == 0) {
    break;
  }
}

// zero padding string
String.format("%1$" + length + "s", str).replace(' ', '0');

// block chain
// http://www.bitweb.co.kr/news/list.php?mcode=m659o6x
// https://www.popit.kr/java-%EC%BD%94%EB%93%9C%EB%A1%9C-%EC%9D%B4%ED%95%B4%ED%95%98%EB%8A%94-%EB%B8%94%EB%A1%9D%EC%B2%B4%EC%9D%B8blockchain/

//external exec
http://blog.daum.net/_blog/BlogTypeView.do?blogid=0Nz1O&articleno=69&categoryId=29&regdt=20090430162905
https://d2.naver.com/helloworld/1113548



// quartz
// update trigger
https://www.jellyfishtechnologies.com/blog/update-the-trigger-of-quartz-job-at-runtime/

// 최대공약수
private long gcd(int p, int q) {
	if(q == 0) return p;
	return gcd(q, p%q);
}

// 최소공배수	
private long lcm(int p, int q) {
	return (long)(p*q)/gcd(p, q);
}

//query
// from, where, rownum, group by, having, select, order by
// TO_DATE(... , 'YYYY/MM/DD HH24:MI:SS')

https://stackoverflow.com/questions/7840389/print-2-d-array-in-spiral-order			
http://codingdojang.com/scode/266

// jetty - client
https://www.eclipse.org/jetty/documentation/jetty-9/index.html#http-client

// jetty - server 
https://www.eclipse.org/jetty/documentation/jetty-9/index.html#jetty-helloworld
