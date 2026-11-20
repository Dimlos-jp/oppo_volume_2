# oppo_volume_2

English | [日本語](#日本語)

A small Android app that works around an OPPO limitation: MacroDroid cannot change the volume
on OPPO phones unless MacroDroid is in the foreground. Use this app together with a macro
to change the volume while MacroDroid runs in the background.

## Install
A debug-signed APK is included in this repository: [app-debug.apk](app-debug.apk).
It can also be downloaded here:
[oppo_volume_2_v2.0.apk](https://www.mediafire.com/file/gv85dx59w6o7pgh/oppo_volume_2_v2.0.apk/file)

## Usage
An action block for setting the values is available here:
[oppo_volume_2_setting.ablock](https://www.mediafire.com/file/auzok5b454ph6f2/oppo_volume_2_setting.ablock/file)

Setting values:
- Each value is an integer from -1 to 16.
- A value of -1, or a blank value, leaves that volume unchanged.
- Enter values only for the streams you want to change. Trying to change all streams at once may not work.

---

## 日本語

OPPOの端末では、MacroDroidがフォアグラウンドにないと音量を変更できません。
この問題に対応するための小さなAndroidアプリです。マクロと組み合わせて使うことで、
MacroDroidがバックグラウンドでも音量を変更できます。

### インストール
このリポジトリにデバッグ署名のAPKを入れてあります: [app-debug.apk](app-debug.apk)
こちらからもダウンロードできます:
[oppo_volume_2_v2.0.apk](https://www.mediafire.com/file/gv85dx59w6o7pgh/oppo_volume_2_v2.0.apk/file)

### 使い方
設定用のアクションブロックはこちらです:
[oppo_volume_2_setting.ablock](https://www.mediafire.com/file/auzok5b454ph6f2/oppo_volume_2_setting.ablock/file)

設定値:
- 設定値は -1 から 16 の整数です。
- -1 または空欄にすると、その音量は変更されません。
- 変更したいストリームにのみ設定値を入力してください。すべてのストリームを一度に変更しようとすると、うまくいかない場合があります。
