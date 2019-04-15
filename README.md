# Statusbar
- Từ phiên bản Android KitKat (4.4), Google đã cho phép chúng tôi hỗ trợ status bar transparent, tuyệt vời nhất từng được tìm kiếm trong nhiều năm trong SDK chính thức.

- Và bây giờ trong theme material mới của Lollipop với một số control UI và kết hợp màu sắc đẹp mắt, chúng tôi thực sự có thể tận dụng tối đa tính năng thú vị đó.

- Status bar transparent này thường được sử dụng với navigation drawer dường như bên dưới thanh trạng thái. Ngoài ra đối với hoạt động chi tiết với hình ảnh trên đầu và bố trí điều phối viên, statusbar transparent giờ đây đã trở thành một công cụ UI tiêu chuẩn.

- Ở đây tôi sẽ trình bày cách bạn có thể thực hiện giao diện tương tự trong ứng dụng của mình cho các thiết bị chạy phiên bản Android 4.4 trở lên.

- Trước hết, vì status bar này chỉ được hỗ trợ trong phiên bản 4.4 trở lên, chúng ta cần tạo một thư mục value-v19 .

- Vì vậy, tạo một thư mục mới trong thư mục res của bạn dưới dạng value-v19.

- Trong value-V19 , sao chép giá trị bình thường của bạn styles.xml mà là có chủ đề bình thường của bạn trong đó.

Ví dụ: sau đây có thể là chủ đề của bạn:

normal_style.jpg

- Chủ đề ở trên này sẽ nằm trong tệp style.xml bình thường của bạn , là thư mục giá trị bình thường. Ở đây, NoActionBar có nghĩa là bạn sẽ không có tiêu đề trong hoạt động của mình. Vui lòng sử dụng thanh công cụ mới và sau đó đặt nó làm thanh hành động của hoạt động.

- Đoạn code sau giải thích cách đặt thanh công cụ làm thanh hành động:

thanh công cụ_activity.jpg

- Điều này sẽ đặt thanh công cụ mới như một thanh hành động. Bây giờ, đến điểm chính của chúng tôi là làm thế nào chúng ta có thể đặt thanh trạng thái mờ trên thanh công cụ.

- Tôi hy vọng bạn đã sao chép thư mục giá trị thông thường style.xml trong thư mục mới value-v19. 

- Trong này styles.xml mà bạn đã sao chép trong các giá trị-V19 , xác định các chủ đề như sau:

transculent_statusbar.jpg

- Ở đây, trong đoạn trích trên, -> android:windowTranslucentStatus -> 

- In your container activity layouts, don’t forget to set the fitSystemWindow=”true”, for the parent layout and also for the toolbar and other internal views for which you want the UI fit to the system window. Which is quite a common use for drawer activity and detail activity with coordinator layout.

- After applying the above changes, you will finally get the layout look as below:


- To apply this same thing for Lollipop as well, just copy the directory of values-v19 and paste as values-v21 in which you can make some changes specific to the Lollipop version as well.

- Final thing is not to forget to set this theme in your activity for which you want to set this cool effect of transparent status bar.

 

 
