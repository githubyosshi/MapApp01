# MapApp01
＜アプリ名＞
＜機能＞
＜技術＞
⑴AndroidManifestxmlにパーミッション設定

⑵証明書のフィンガープリント生成
  ①keystoreから取得
    $ keytool -v -list -keystore ~/.android/debug.keystore
  ②apkファイルから取得
    keytool -list -printcert -jarfile app.apk
  ①でJDKのインストール警告出たのでパスを通すが解決せず
  .bash_profileの編集
  $ open ~/.bash_profile
      export PATH=$PATH:/Applications/"Android Studio.app"/Contents/jre/jdk/Contents/Home/bin
      export JAVA_HOME=/Applications/"Android Studio.app"/Contents/jre/jdk/Contents/Hom

⑶Google Maps APIキーの取得
⑷Googleマップの利用