#Springboot to docker ec2 연결테스트 프로젝트

#사용스펙
1. JDK11 (amazon)
2. ubuntu
3. Maven
4. AWS EC2
5. AWS S3
6. Docker

#순서
1. github main branch push
2. .github -> worokflows -> deploy.yml 설정 파일 읽기
3. deply.yml에 있는 설정 파일대로 순차적으로 진행 후 최종적으로 EC2에 컨테이너 
