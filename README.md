# 🍀 Sparkle-AOS 🍀

## 스파클 (Sparkle)

```
일상 속 데이트에서 다양한 미션을 수행하며, 사랑하는 연인과 보다 더 소중한 추억을 쌓아갈 수 있도록 돕는 서비스
```
<br>

## 🧑🏻‍💻CONTRIBUTORS🧑🏻‍💻
| 이태희<br/>([@haeti-dev](https://github.com/haeti-dev)) | 이동기<br/>([@rkdmf1026](https://github.com/rkdmf1026)) | 이준희<br/>([@l2zh](https://github.com/l2zh)) | 김수빈<br/>([@sub101](https://github.com/sub101)) |
| :---: | :---: | :---: | :---: |
| <img width="540"  src="https://github.com/sub101/Study-Kotlin/assets/58244158/25713f24-e44e-4562-93b0-6c604eb056e2"/> | <img width="540"  src="https://github.com/sub101/Study-Kotlin/assets/58244158/e34ed735-e4d1-49d0-952f-71d2b8d0dfbf"/> | <img width="540"  src="https://github.com/sub101/Study-Kotlin/assets/58244158/7685e517-061d-457f-bd6e-6fd5aa360450"/> |<img width="540"  src="https://github.com/sub101/Study-Kotlin/assets/58244158/7344941f-c9c0-465d-9259-15a1fd1550e8"/> |
| `로그인`<br/>`메인페이지` | `한판 승부 페이지`<br/>`장기 승부 페이지` | `히스토리 페이지` | `소원권 페이지`|
<br>

# Preview
 
 ## 홈
<table>
  <tr>
    <td><img width="200" src="https://github.com/ThinLineIT/FavorIt_Android/assets/50603273/65a389cc-2c7b-4f35-b1e9-90045c8ea93b"></td>
  </tr>
  <tr>
    <td align="center"><b>홈</b></td>   
</table> 

 ## 한판승부
<table>
  <tr>
    <td><img width="200" src="https://github.com/ThinLineIT/FavorIt_Android/assets/50603273/177f8f39-05a3-4c3c-9021-7a6ae3d700e1"></td>
      <td><img width="200" src="https://github.com/ThinLineIT/FavorIt_Android/assets/50603273/8af8ced1-3f44-4004-a25c-f2b26394e776"></td>
      <td><img width="200" src="https://github.com/ThinLineIT/FavorIt_Android/assets/50603273/81719de2-aeb9-47da-990a-1b6471fcf3e4"></td>
  </tr>
  <tr>
    <td align="center"><b>한판승부생성</b></td>
    <td align="center"><b>한판승부기록</b></td>  
    <td align="center"><b>한판승부결과</b></td>  
</table>

## 소원권
<table>
  <tr>
    <td><img width="200" src="https://github.com/ThinLineIT/FavorIt_Android/assets/50603273/b76e5d62-40cc-481c-a0b9-97372d30b2a3"></td>
      <td><img width="200" src="https://github.com/ThinLineIT/FavorIt_Android/assets/50603273/11d44b3f-bbc6-4033-b465-5852854b8653g"></td>
  </tr>
  <tr>
    <td align="center"><b>소원권목록</b></td>
    <td align="center"><b>소원권</b></td>  
</table> 

## 마이페이지
<table>
  <tr>
    <td><img width="200" src="https://github.com/ThinLineIT/FavorIt_Android/assets/50603273/89a2fbd4-cfdf-4f3a-bb7a-04f6f640f560"></td>
      <td><img width="200" src="https://github.com/ThinLineIT/FavorIt_Android/assets/50603273/1652107d-4600-4c03-801d-19cbc24d625c"></td>
  </tr>
  <tr>
    <td align="center"><b>마이페이지</b></td>
    <td align="center"><b>프로필 수정</b></td>  
</table> 


## 📅 Kanban Board
[UNIROID 칸반보드1 - 프로젝트 기초세팅](https://github.com/orgs/U-is-Ni-in-Korea/projects/1)  
[UNIROID 칸반보드2 - 뷰 관련 작업 + 서버 연결 준비](https://github.com/orgs/U-is-Ni-in-Korea/projects/2)  
[UNIROID 칸반보드3 - 서버 연결 + QA 준비](https://github.com/orgs/U-is-Ni-in-Korea/projects/4)
<br>

## 📝 CONVENTION
<details>
<summary>COMMIT CONVENTION</summary>
<div markdown="1">
<br>

```
#이슈번호 / 한국말 또는 영어로 알아볼 수 있게
```

</div>
</details>

<br>

<details>
<summary>BRANCH CONVENTION</summary>
<div markdown="1">
<br>

- **main** : 배포시 사용할 브랜치
- **develop** : feature 브랜치가 합쳐진 브랜치, 가장 완벽하고 최신의 코드가 있어야함
- **feature** : 구현할 이슈를 만들고 해당 작업을 추가, 구현, 개선하는 브랜치
```
feature/{#이슈번호}-이슈내용
```
<br>

</div>
</details>

<br>


<details>
<summary>PR CONVENTION</summary>
<div markdown="1">
<br>

```
템플릿 사용하고, 시연 영상이나 캡쳐본 필수 첨부!!  
적절한 라벨 사용으로 네이밍 대체  
```
```
Approve 2개 이상이어야 merge 가능!!
되도록이면 PR 올라온 당일에 코드리뷰 달아주기!!
```
</div>
</details>
<br>


<details>
<summary>PROJECTS</summary>
<div markdown="1">
<br>

```
To do
- 이슈를 추가할 때 프로젝트를 선택하고 생성하면 자동으로  To-do 안에 들어간다. 

In Progress
- PR을 만들면 자동으로 추가된다.  

Done
- 이슈, PR이 닫히면 자동으로 추가된다.  
```

</div>
</details>
<br>

[CODING CONVENTION](https://kotlinlang.org/docs/coding-conventions.html#names-for-backing-properties)

<br>

PACKAGE CONVENTION

```
📦java.sopt.sparkle
├─📂data
│  ├─📂entity
│  ├─📂repository
│  │  └─📂example
│  ├─📂service
│  └─📂source
│      ├─📂local
│      └─📂remote
│          ├─📂request
│          └─📂response
├─📂di
├─📂presentation
└─📂util
    ├─📂binding
    └─📂extension
```
<br>

# Specification
<table class="tg">
<tbody>
  <tr>
    <td><b>Architecture</b></td>
    <td>MVVM</td>
  </tr>
  <tr>
    <td><b>Design Pattern</b></td>
    <td>Repository Pattern, Observer Pattern</td>
  </tr>
<tr>
    <td><b>Jetpack Components</b></td>
<td>DataBinding, LiveData, ViewModel, Lifecycle, ViewPager2 </td>
</tr>
<tr>
    <td><b>Other Library</b></td>
<td> Coil, Hilt2 </td>
</tr>
<tr>
    <td><b>Network</b></td>
<td>Retrofit2, coroutine</td>
</tr>
<tr>
    <td><b>Strategy</b></td>
<td>Git Flow</td>
</tr>
<tr>
    <td><b>CI/b></td>
<td>GiHub Action(KtLint, Build Gradle)</td>
</tr>
<tr>
    <td><b>Other Tool</b></td>
<td>Slack, Notion, Figma</td>
</tr>
