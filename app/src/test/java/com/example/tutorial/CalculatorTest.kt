package com.example.tutorial

import org.junit.Test
import org.assertj.core.api.Assertions.*

import org.junit.Assert.*
import org.junit.Before

class CalculatorTest {
    lateinit var sut: Calculator

    // 共通の初期化処理
    @Before
    fun setUp(){
        sut = Calculator()
    }

    // 掛け算の結果を取得する
    @Test
    fun multiplyResult() {
        // 事前準備
        val actual = sut.multiply(x = 2, y = 3)
        // 期待値
        val expected = 6
        assertThat(actual).isEqualTo(expected)
    }

    // 第一引数に0を設定
    @Test
    fun multiplyZeroResult() {
        // 事前準備
        val actual = sut.multiply(x = 0, y = 3)
        // 期待値
        val expected = 0
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun divideResult() {
        var actual = sut.divide(x = 6, y = 2)
        var expected = 3.0
        assertThat(actual).isEqualTo(expected)
    }

    // 例外処理のテスト
    @Test(expected = IllegalArgumentException::class)
    fun divideResultError(){
        val actual = sut.divide(x = 3, y = 0)
    }
}