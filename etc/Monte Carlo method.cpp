#include <iostream>
#include <cstdlib>
#include <cmath>

int main() {
    double cnt = 0.0;
    for (double i = 1; i < 40001; i++) {
        //static_cast: 일반적인 명시적 캐스팅 연산자, 안전성 보장+일반적인 타입 변환이 가능한 상황에서 사용
        //rand(): 0~32767 중 무작위로 한 수를 반환 (RAND_MAX == 32767)
        double x = static_cast<double>(rand()) / RAND_MAX;
        double y = static_cast<double>(rand()) / RAND_MAX;

        //반지름이 1인 원안에 존재하는 좌표일 경우, 즉 좌표가 원 안에 있을 경우
        if (pow(x, 2) + pow(y, 2) <= 1)
            cnt++;

        /*
        원의 넓이 = 𝝿r^2
        정사각형의 넓이 = r^2
        𝝿r^2 / r^2 = 𝝿 (즉, 원주율 = 원의 넓이/정사각형의 넓이)
        */
        //fmod(x,y): x/y의 부동 소수점 나머지를 연산
        //현재는 1사분면에서만 값을 얻고있기 때문에 마지막에 4를 곱하여 계산
        if (fmod(i, 2000) == 0)
            printf("%.4f\n", (cnt/i) * 4);
    }

    return 0;
}