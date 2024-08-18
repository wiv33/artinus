# 기술 선택
- webflux
- r2dbc
- postgresql
- gradle

# 기술 선택 이유
- r2dbc & postgresql: CUD 작업에 조금이나마 유리하고, 구독의 단일 진입점 서버 구성을 염두한 선택.


# 다중화 동시성
- RDB 무결성으로도 문제가 발생할 것 같지 않습니다.
- 이 테스트를 위해 thread 동시 실행으로 검증합니다.