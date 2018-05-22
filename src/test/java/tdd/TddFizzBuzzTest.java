package tdd;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class TddFizzBuzzTest {
/*
[ ] 数を文字列に変換する
    [x] 数値の1を文字列の１に変換する
    [x] 数値の２を文字列の２に変換する
[ ] ３の倍数の時は「Fizz」
    [x] 数値の３を文字列の「Fizz」に変換する
    [x] 数値の６を文字列の「Fizz」に変換する
[ ] ５の倍数のときは「Buzz」
    [x] 数値の5を文字列の「Buzz」に変換する
[ ] ３と５両方の倍数の場合には「FizzBuzz」
[ ] 1から100までの数
[ ] 数をプリントする
 */

    public static class 数を文字列に変換する {
        @Test
        public void 数を文字列に変換する_数値の1を文字列の1に変換する() {
            assertEquals("1", new TddFizzBuzz().convert(1));
        }
        @Test
        public void 数を文字列に変換する_数値の2を文字列の2に変換する() {
            assertEquals("2", new TddFizzBuzz().convert(2));
        }
    }
    public static class _３の倍数の時はFizz {
        @Test
        public void _３の倍数の時はFizz_数値の3を文字列のFizzに変換する() {
            assertEquals("Fizz", new TddFizzBuzz().convert(3));
        }

        @Test
        public void _３の倍数の時はFizz_数値の6を文字列のFizzに変換する() {
            assertEquals("Fizz", new TddFizzBuzz().convert(6));
        }
    }
    public static class _５の倍数のときはBuzz {
        @Test
        public void _５の倍数のときは_Buzz_数値の5を文字列のBuzzに変換する() {
            assertEquals("Buzz", new TddFizzBuzz().convert(5));
        }
    }
}

