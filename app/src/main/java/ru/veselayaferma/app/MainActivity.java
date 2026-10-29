упаковка ru.veselayaferma.app;

приложение android.app.АкЂивноссть;
Нажатие на спину
импорт android.webkit.WebChromeClient;
импорт android.webkit.WebSettings;
импорт android.webkit.WebView;
импорт android.webkit.WebViewClient;
импорт android.view.View;

публичный класс Основная деятельность расширяет Активность {
    частный Веб-просмотр веб-просмотр;

    @Переопределить
    защищенный пустота наСоздать(Пучок сохраненное состояние экземпляра) {
        супер.наСоздать(сохраненное состояние экземпляра);
        получитьОкно().setStatusBarColor(андроид.графика.Цвет.ргб(88, 199, 255));
        получитьОкно().setNavigationBarColor(андроид.графика.Цвет.ргб(72, 185, 67));
        вебВид = новый Веб-просмотр(этот);
        веб-просмотр.setBackgroundColor(андроид.графика.Цвет.ргб(88, 199, 255));
        Веб-настройки настройки = вебВид.getSettings();
        настройки.setJavaScriptEnabled(истинный);
        настройки.setDomStorageВключено(ложный);
        настройки.setAllowFileAccess(истинный);
        настройки.setAllowContentAccess(истинный);
        настройки.setMediaPlaybackRequiredUserЖест(истинный);
        веб-просмотр.setWebViewClient(новый WebViewClient());
        веб-просмотр.setWebChromeClient(новый ВебХромКлиент());
        веб-просмотр.loadUrl("файл:///android_asset/index.html");
        setContentView(веб-просмотр);
    }

    @Переопределить
    публичный пустота наBackPressed() {
        если (вебВид!= нулевой && веб-просмотр.canGoBack()) {
            веб-просмотр.вернуться назад();
        } еще {
            супер.наНажатие на спину();
        }
    }
}
