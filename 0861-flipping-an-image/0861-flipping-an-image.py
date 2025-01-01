class Solution:
    def flip(n):
        return 1 if n == 0 else 0

    def flipAndInvertImage(self, image):
        r = len(image)
        c = len(image[0])

        # Flip each row horizontally
        for i in range(r):
            for j in range(c // 2):
                # Swap elements
                image[i][j], image[i][c - j - 1] = image[i][c - j - 1], image[i][j]

        # Invert the image
        for i in range(r):
            for j in range(c):
                if image[i][j] ==0:
                    image[i][j]=1
                else:
                    image[i][j]=0

                    

        return image
