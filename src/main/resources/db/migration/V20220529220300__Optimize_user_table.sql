CREATE INDEX IF NOT EXISTS users_deleted_at ON users(deleted_at);

ALTER TABLE "users" ADD COLUMN IF NOT EXISTS "verified_at" TIMESTAMP WITH TIME ZONE;