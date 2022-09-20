# bitmap-transformer

Project by Mandy Mason, Darius Owens, Stanley Wilder

## Image Transforms:

greyScale method converts red, green, and blue values to shades of grey.

verticalReverse method flips the image along the x-axis.

greenScale method converts red, and blue values to shades of green.

## Implementation

To run the bitmap transformer, clone this project into a new directory, open with 
IntelliJ IDEA, and run the following from the command line:

`./gradlew run --args '<input-file-path> <output-file-path> <transform-name>`

Included file paths:
Input: 'baldy-8bit.bmp'
Output: '<any-file>.bmp'

Available transform names:
'grey-scale', 'green-scale', and 'vertical-reverse'

### Attribution: 

Special Thanks to Raul Zarate and Ben Mills

Sharina Stubbs:
[GitHub Project](https://github.com/SharinaS/bitmap-transformer/blob/master/src/main/java/bitmap/transformer/BitMap.java)

[Oracle Docs](https://docs.oracle.com/javase/tutorial/2d/images/loadimage.html)

[IDR Solutions](https://blog.idrsolutions.com/2018/08/how-to-write-bmp-images-in-java/)

