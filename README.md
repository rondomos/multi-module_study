#### 멀티모듈 연습 ####
1. 모듈 생성 및 모듈 종속성 설정
2. 레이어드 아키텍쳐로 사용 (infrastructure, domain, service, presentation)
3.


4. 멀티모듈 설계 내용

   |- multi-module(root)
       |- server
         |- module-server-redis
       |- common
         |- dto
         |- event
         |- exception
         |- utils
       |- domain
         |-module-domain-user
          |- user.java
         |-module-domain-seat
          |- seat.java
         |-module-domain-movie
          |- movie.java
         |-module-domain-movieTime
          |- movieTime.java
         |-module-domin-reservation
          |- reservation.java
         |-module-domain-img
          |- img.java
         |-module-domain-kmdbApi
           |- kmdbApi.java
         |-dto
         |-exception
         |-repository
         |-service
       |- infra (연동모듈 : 외부 서비스와 연동하는 모듈이다. 큰 변화가 일어날 가능성 큼)
         |- kmdbApi.java
       |- server (batch, admin, api 등이 포함되고 잦은 변화가 일어남)
         |- module-server-redis
