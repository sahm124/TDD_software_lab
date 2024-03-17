
# TDD_software_lab


<h2 dir="rtl">
پاسخ سوالات تئوری(به برنچ master مراجعه شود)
</h2>

<h2 dir="rtl">

برنامه های کوچک:
</h2>
<p dir="rtl">

در برنامه های کوچک به نظر من روش تست سنتی مناسب تر است، چون برنامه ها و توابع ما پیچیده نیستن و یک بار هم تحلیل بشن کافیه و اول کد زده بشه و بعد تست همان کیفیت و دارد و پیچیدگی کمتری تا TDD دارد.
</p>

<h2 dir="rtl">

برنامه های متوسط:
</h2>

<p dir="rtl">
TDD: برای برنامه‌های متوسط که تا حدودی پیچیدگی دارند TDD  می ‌تواند بسیار مناسب باشد. این روش کمک می‌کند تا از ابتدایی‌ترین مراحل توسعه، کد بهبود یابد و همچنین اطمینان حاصل شود که تغییراتی که به کد اعمال می‌شود، باعث شکست تست‌ها نمی‌شود. اما تست کردن سنتی برای برنامه‌های متوسط، سنتی نیز قابل قبول است. اما این روش ممکن است باعث ایجاد کدی با کیفیت کمتر شود و ممکن است در مراحل بعدی توسعه با مشکلات بیشتری روبه‌رو شود
</p>
<h2 dir="rtl">
پروژه‌های بزرگ و پیچیده:
</h2>
<p dir="rtl">
TDD: برای پروژه‌های بزرگ و پیچیده که نیاز به انعطاف پذیری و استحکام بالا دارند، TDD  می ‌تواند انتخاب مناسبی باشد. زیرا اول ما برای تست فرایند های پیچیده خارج فرایند های اجرایی اول ورودی و انتظاری که از خروجی داریم را تعیین میکنیم (برای تست) و بعد موقع ایجاد پیچیدگی های فرایند های میانی را حل میکنیم ( و این دو پیچیدگی از هم تا حدودی جدا حل میشن پس مسئله گویی شکسته شده و راحت تر پیش می رود و همچنین احتمال اشتباه تست نوشتن هنگامی که در نوشتن کد اشتباه کنیم کمتر می شود ( جوب کمتری میزنیم :))
برای پروژه‌های بزرگ و پیچیده، استفاده از روش تست کردن سنتی ممکن است باعث ایجاد کدی با کیفیت پایین‌تر و افزایش ریسک برای اعمال تغییرات باشد، زیرا تمرکز بیشتری بر روی توسعه کد در مراحل ابتدایی و تست آن در مراحل بعدی وجود دارد
</p>

<h2 dir="rtl">
در مورد وظایف تیم ایجاد و تیم تضمین کیفیت:
</h2>
<p dir="rtl">

تیم ایجاد (Development Team) عموماً مسئولیت ایجاد کد را برعهده دارد و بیشتر با توسعه کد و ایجاد تست‌های واحد (Unit      (Tests  سروکار دارد  و با دیگر تست ها درگیر نیست زیرا از فعالیت ایجاد و توسعه کد ها دور میشود و تخصص متفاوتی است که در حوزه تیم تضمین کیفیت است.
تیم تضمین کیفیت (QA Team) عموماً مسئولیت اجرای تست‌های تکاملی (Integration Tests)، تست‌های سیستم   (System Tests)، تست‌های عملکردی  (Functional Tests)، و تست‌های بار و عملکرد (Performance Testing) را بر عهده دارد. این تست‌ها معمولاً در مراحل بعدی توسعه صورت می‌گیرند و به منظور اطمینان از عملکرد کلی نرم‌افزار و ارتباط صحیح بین اجزا مختلف استفاده می ‌شوند.
</p>
<h2 dir="rtl">
تست‌های واحد  (Unit Tests) :
</h2>
<p dir="rtl">

در این تست‌ها، هر قسمت کوچکی از کد، معمولاً یک تابع یا یک کلاس، جداگانه تست می ‌شود
هدف اصلی این تست‌ها بررسی صحت عملکرد مولفه‌های جزئی کد و اطمینان از اینکه هر قسمت از کد به درستی عمل می‌  کند
معمولاً توسط توسعه‌دهندگان ایجاد می‌شوند و برای اطمینان از عملکرد درست و بهینه قسمت‌های مختلف کد استفاده می‌ شوند
</p>

<h2 dir="rtl">
تست‌های تکاملی (Integration Tests) :
</h2>
<p dir="rtl">

در این تست‌ها، تعامل بین قسمت‌های مختلف یک سیستم یا ماژول‌های مختلف یک برنامه را بررسی می ‌کنند
هدف اصلی این تست‌ها اطمینان از اینکه قسمت‌های مختلف سیستم با هم تعامل می‌کنند و عملکرد کلی سیستم به درستی است
این تست‌ها معمولاً پس از اجرای تست‌های واحد انجام می‌شوند و می‌توانند برای کشف مشکلات انتگرال سیستم مفید باشند
</p>
<h2 dir="rtl">
تست‌های سیستم  (System Tests) :
</h2>
<p dir="rtl">

این تست‌ها عملکرد کلی سیستم را بررسی می‌کنند، بر اساس نیازهای کاربر نهایی
هدف اصلی این تست‌ها اطمینان از اینکه سیستم به درستی و به شکل مطلوب کار می‌کند و تمامی نیازمندی‌های کاربر را برآورده می ‌کند
این تست‌ها معمولاً به صورت تلفیقی انجام می‌شوند و می‌توانند شامل تعامل با رابط کاربری، تست عملکردی، تست بار، و غیره باشند
</p>
<h2 dir="rtl">
تست‌های عملکردی  (Functional Tests) :
</h2>
<p dir="rtl">

این تست‌ها بررسی می‌کنند که سیستم به درستی عملکرد مورد نظر را انجام می‌دهد یا خیر
هدف اصلی این تست‌ها اطمینان از اینکه سیستم نیازمندی‌های کاربر را به درستی برآورده می‌ کند
معمولاً توسط تیم تضمین کیفیت انجام می‌شوند و به صورت تابعیت‌های زیادی برای موارد مختلف نیازمندی‌ها تعریف می‌ شوند
</p>
<h2 dir="rtl">
تست‌های بار و عملکرد  (Performance Testing) :
</h2>
<p dir="rtl">

این تست‌ها عملکرد سیستم تحت بار مختلف را بررسی می‌ کنند
هدف اصلی این تست‌ها اطمینان از اینکه سیستم تحت بار و فشار کاربران مختلف به درستی عمل می ‌کند و عملکرد قابل قبولی دارد
معمولاً توسط تیم تضمین کیفیت انجام می‌شوند و ممکن است از ابزارهای خاصی برای شبیه‌سازی بار و فشار استفاده شود
</p>
