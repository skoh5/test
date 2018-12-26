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

// block chain
// http://www.bitweb.co.kr/news/list.php?mcode=m659o6x
// https://www.popit.kr/java-%EC%BD%94%EB%93%9C%EB%A1%9C-%EC%9D%B4%ED%95%B4%ED%95%98%EB%8A%94-%EB%B8%94%EB%A1%9D%EC%B2%B4%EC%9D%B8blockchain/

//external exec
http://blog.daum.net/_blog/BlogTypeView.do?blogid=0Nz1O&articleno=69&categoryId=29&regdt=20090430162905
https://d2.naver.com/helloworld/1113548

//thread pool
http://hochulshin.com/java-multithreading-executor-basic/
https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/

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

def snailNumber(array, r, c):

    lst = list()

    cnt = 0         # 현재 출력할 수
    curr_point = (0,0)  # 현재 수를 출력할 좌표
    curr_direct = 'RIGHT'   # 현재 방향

    # 방향을 넣으면 움직여야할 좌표를 반환하는 dictionary
    # 이차원 리스트에서 움직일 수있는 방향은 상하좌우 4개의 방향
    move = {'UP': (-1,0),'DOWN': (1,0),'LEFT': (0,-1),'RIGHT': (0,1)}

    # 현재 방향을 넣으면 다음방향을 반환하는 dictionary
    next_direct = {'UP': 'RIGHT','RIGHT': 'DOWN','DOWN': 'LEFT','LEFT': 'UP'}

    # 방향이 바뀔때 마다 움직여야할 거리를 순서대로 list에 담음
    for i in range(r+c-1):  
        if i % 2 is 0:
            lst.append(c)
            r = r - 1            
        else:
            lst.append(r)
            c = c - 1
    print(lst)
 # array에 차례로 숫자를 씀
#------------------------------------------------
# 이 부분에 코딩하시오.

    for tmp in lst :
        i = 0
        for i in range(0, tmp) :
            array[curr_point[0]][curr_point[1]] = cnt
            cnt = cnt + 1
            if (i == tmp - 1):
                curr_direct = next_direct[curr_direct]
            curr_point = (curr_point[0] + move[curr_direct][0], curr_point[1] + move[curr_direct][1])
			
https://stackoverflow.com/questions/7840389/print-2-d-array-in-spiral-order			
http://codingdojang.com/scode/266
