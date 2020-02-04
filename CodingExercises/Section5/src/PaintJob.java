public class PaintJob {

    // calculates how man buckets of paint is needed based on area of wall, what area a bucket covers, and extra buckets at home
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double wallArea = width * height;
        int bucketsNeeded = (int) Math.ceil(wallArea / areaPerBucket);
        int bucketsToBuy = bucketsNeeded - extraBuckets;
        return bucketsToBuy;
    }

    // overloaded function for 0 buckets at home
    public static int getBucketCount (double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return getBucketCount(width, height, areaPerBucket, 0);
    }
    
    // overloaded function with area instead of width and height
    public static int getBucketCount (double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        return getBucketCount(area, 1, areaPerBucket, 0);
    }

}
